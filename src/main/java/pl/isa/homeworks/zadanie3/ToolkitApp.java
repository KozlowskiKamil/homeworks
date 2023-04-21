package pl.isa.homeworks.zadanie3;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ToolkitApp {
    private static final int SHOW_ALL = 1;
    private static final int FIND_TOOL = 2;
    private static final int ADD_TOOL = 3;
    private static final int EXIT = 0;

    public static void main(String[] args) {
        ToolkitController toolkitController = new ToolkitController();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;
        while (isRunning) {
            showOptions();
            try {
                int selectedOption = readOption(scanner);

                switch (selectedOption) {
                    case SHOW_ALL -> showAll(toolkitController);
                    case FIND_TOOL -> findTool(toolkitController);
                    case ADD_TOOL -> addTool(toolkitController);
                    case EXIT -> isRunning = false;
                    default -> System.out.println("The wrong number has been entered.");
                }
            } catch (InputMismatchException e) {
                System.out.println("An invalid character has been entered.");
                scanner.next();
            }

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

    private static void findTool(ToolkitController toolkitController) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Search for a tool");
        String find = scanner.nextLine().toLowerCase();
        List<Tool> findList = toolkitController.getTools().stream().filter(tool -> tool.getName().toLowerCase().contains(find)).toList();
        if (findList.isEmpty()) {
            System.out.println("You don't have any tools with this name");
        } else {
            System.out.println("You have the tools with this name: ");
            findList.forEach(ToolkitApp::showTool);
        }
    }

    private static void addTool(ToolkitController toolkitController) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Add a name tool");
        String addName = scanner.nextLine();
        System.out.println("Add a size tool");
        float addSize = scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Add a unit tool");
        String addUnit = scanner.nextLine();
        Tool newTool = new Tool(addName, new Tool.ToolSize(addSize, addUnit));
        toolkitController.add(newTool);
    }
}