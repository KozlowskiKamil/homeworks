package pl.isa.homeworks.zadanie3;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ToolkitController {
    private final List<Tool> tools;


    public ToolkitController() {
        tools = readToolkit();
    }

    public List<Tool> getTools() {
        return new ArrayList<>(tools);
    }

    public boolean isEmpty() {
        if (tools.isEmpty()) {
            return true;
        } else return false;
    }

    public boolean add(Tool tool) {
        tools.add(tool);
        return saveToolkit();
    }

    private List<Tool> readToolkit() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            File file = new File("src/main/resources/toolkit.json");
            TypeReference<List<Tool>> typeReference = new TypeReference<>() {
            };
            List<Tool> toList = objectMapper.readValue(file, typeReference);
            return toList;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Collections.emptyList();
    }

    private boolean saveToolkit() {
        return false;
    }
}