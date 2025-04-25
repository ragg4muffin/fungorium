package gamelogic;

import java.util.Scanner;

import gombasz.Gombasz;
import rovarasz.Rovarasz;
import tekton.*;
import gombasz.*;
import rovarasz.*;

public class Fungorium {
    private Kor game;

    public Fungorium() {
        game = new Kor();
    }

    public static void main(String[] args) {
        Fungorium fungorium = new Fungorium();
        fungorium.runCLI();
    }

    private void runCLI() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Fungorium CLI!");
        System.out.println("Type 'help' to see available commands.");

        while (true) {
            System.out.print("> ");
            String command = scanner.nextLine().trim();

            if (command.equalsIgnoreCase("exit")) {
                System.out.println("Exiting Fungorium...");
                break;
            }

            handleCommand(command);
        }

        scanner.close();
    }

    private void handleCommand(String command) {
        // Remove leading '/' if present
        if (command.startsWith("/")) {
            command = command.substring(1);
        }

        String[] parts = command.split(" ");
        String action = parts[0];

        switch (action.toLowerCase()) {
            case "addrovarasz":
                handleAddRovarasz(parts);
                break;

            case "addgombasz":
                handleAddGombasz(parts);
                break;

            case "modspora":
                handleModSpora(parts);
                break;

            case "gombasz":
                handleGombasz(parts);
                break;

            case "rovarasz":
                handleRovarasz(parts);
                break;

            case "modtekton":
                handleModTekton(parts);
                break;

            case "event":
                handleEvent(parts);
                break;

            case "help":
                printHelp();
                break;

            default:
                System.out.println("Unknown command. Type 'help' for a list of commands.");
                break;
        }
    }

    private void handleAddRovarasz(String[] parts) {
        // Example: /addrovarasz [nev]="Rovarasz1" [pos]="A1" [id]="R1"
        String name = extractArgument(parts, "nev");
        String pos = extractArgument(parts, "pos");
        String id = extractArgument(parts, "id");

        if (name != null && pos != null && id != null) {
            game.addRovarasz(new Rovarasz(name, pos, id));
            System.out.println("Rovarasz added: " + name + " at position " + pos + " with ID " + id);
        } else {
            System.out.println("Invalid arguments for /addrovarasz. Usage: /addrovarasz [nev]=<name> [pos]=<position> [id]=<id>");
        }
    }

    private void handleAddGombasz(String[] parts) {
        // Example: /addgombasz [nev]="Gombasz1" [pos]="B2" [id]="G1"
        String name = extractArgument(parts, "nev");
        String pos = extractArgument(parts, "pos");
        String id = extractArgument(parts, "id");

        if (name != null && pos != null && id != null) {
            game.addGombasz(new Gombasz(name, pos, id));
            System.out.println("Gombasz added: " + name + " at position " + pos + " with ID " + id);
        } else {
            System.out.println("Invalid arguments for /addgombasz. Usage: /addgombasz [nev]=<name> [pos]=<position> [id]=<id>");
        }
    }

    private void handleModSpora(String[] parts) {
        // Example: /modspora [pos]="A1" [sorszám]=1 -e g
        String pos = extractArgument(parts, "pos");
        String sorszam = extractArgument(parts, "sorszám");
        String effect = extractFlag(parts, "-e");

        if (pos != null && sorszam != null && effect != null) {
            game.modifySpora(pos, Integer.parseInt(sorszam), effect);
            System.out.println("Spóra modified at position " + pos + " with effect " + effect);
        } else {
            System.out.println("Invalid arguments for /modspora. Usage: /modspora [pos]=<position> [sorszám]=<number> -e <effect>");
        }
    }

    private void handleGombasz(String[] parts) {
        // Example: /gombasz -f "B2-C3"
        String flag = parts[1];
        String value = parts[2];

        switch (flag) {
            case "-f":
                game.gombaszFonal(value);
                System.out.println("Gombafonal created: " + value);
                break;

            case "-s":
                game.gombaszSpora(value);
                System.out.println("Spóra shot to: " + value);
                break;

            default:
                System.out.println("Invalid flag for /gombasz. Usage: /gombasz -f <path> or /gombasz -s <position>");
                break;
        }
    }

    private void handleRovarasz(String[] parts) {
        // Example: /rovarasz -m 1 "B2"
        String flag = parts[1];
        String id = parts[2];
        String value = parts.length > 3 ? parts[3] : null;

        switch (flag) {
            case "-m":
                game.rovaraszMove(Integer.parseInt(id), value);
                System.out.println("Rovar moved to: " + value);
                break;

            case "-e":
                game.rovaraszEat(Integer.parseInt(id));
                System.out.println("Rovar ate spóra.");
                break;

            case "-c":
                game.rovaraszEat(Integer.parseInt(id));
                System.out.println("Rovar attempted to cut.");
                break;

            default:
                System.out.println("Invalid flag for /rovarasz. Usage: /rovarasz -m <id> <position>, -e <id>, or -c <id>");
                break;
        }
    }

    private void handleModTekton(String[] parts) {
        // Example: /modtekton [id]=B2 -t o
        String id = extractArgument(parts, "id");
        String type = extractFlag(parts, "-t");

        if (id != null && type != null) {
            game.modifyTekton(id, type);
            System.out.println("Tekton modified: " + id + " with type " + type);
        } else {
            System.out.println("Invalid arguments for /modtekton. Usage: /modtekton [id]=<id> -t <type>");
        }
    }

    private void handleEvent(String[] parts) {
        // Example: /event -nr
        String flag = parts[1];

        if (flag.equals("-nr")) {
            game.nextRound();
            System.out.println("Next round executed.");
        } else {
            System.out.println("Invalid flag for /event. Usage: /event -nr");
        }
    }

    private void printHelp() {
        System.out.println("Available commands:");
        System.out.println("/addrovarasz [nev]=<name> [pos]=<position> [id]=<id>");
        System.out.println("/addgombasz [nev]=<name> [pos]=<position> [id]=<id>");
        System.out.println("/modspora [pos]=<position> [sorszám]=<number> -e <effect>");
        System.out.println("/gombasz -f <path> or /gombasz -s <position>");
        System.out.println("/rovarasz -m <id> <position>, -e <id>, or -c <id>");
        System.out.println("/modtekton [id]=<id> -t <type>");
        System.out.println("/event -nr");
        System.out.println("Type 'exit' to quit.");
    }

    private String extractArgument(String[] parts, String key) {
        for (String part : parts) {
            if (part.startsWith("[" + key + "]=")) {
                return part.substring(key.length() + 3).replace("\"", "");
            }
        }
        return null;
    }

    private String extractFlag(String[] parts, String flag) {
        for (String part : parts) {
            if (part.startsWith(flag)) {
                return part.substring(flag.length());
            }
        }
        return null;
    }
}