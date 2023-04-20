package pl.isa.homeworks.zadanie3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class ToolkitApp {
    private static final int SHOW_ALL = 1;
    private static final int FIND_TOOL = 2;
    private static final int ADD_TOOL = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        readJson();


        ToolkitController toolkitController = new ToolkitController();
        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            showOptions();
            try {
                int selectedOption = readOption(scanner);

                switch (selectedOption) {
                    case SHOW_ALL -> showAll(toolkitController);
                    case FIND_TOOL -> findTool();
                    case ADD_TOOL -> addTool();
                    case EXIT -> isRunning = false;
                    default -> System.out.println("Został wprowadzony niewłaściwy numer.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Został wprowadzony niewłaściwy znak.");
                scanner.next();
            }

        }
    }

    private static void readJson() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/toolkit.json");
            TypeReference<List<Tool>> typeReference = new TypeReference<>() {};
            List<Tool> toolList = objectMapper.readValue(file, typeReference);
            System.out.println("toolList = " + toolList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void showOptions() {
        System.out.println("Menu options\n"
                + SHOW_ALL + " - show all tools\n"
                + FIND_TOOL + " - find tool by name\n"
                + ADD_TOOL + " - add new tool\n"
                + EXIT + " - exit");
    }

    private static int readOption(Scanner scanner) {
        return scanner.nextInt();
    }

    private static void showAll(ToolkitController toolkitController) {
        if (toolkitController.isEmpty()) {
            System.out.println("You have no tools in your toolkit");
            return;
        }

        toolkitController.getTools().forEach(ToolkitApp::showTool);
        System.out.println("---");
    }

    private static void showTool(Tool tool) {
        System.out.println("---\n" + tool.getName()
                + "\nSize: " + tool.getToolSize().size() + " " + tool.getToolSize().unit());
    }

    private static void findTool() {
        System.out.println("Sorry, I don't know how to find tools yet...");
    }

    private static void addTool() {
        System.out.println("Sorry, I don't know how to add tools yet...");
    }
}
