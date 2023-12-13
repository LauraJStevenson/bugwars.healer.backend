package com.example.renderdeployprocess;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("api/v1/countries")

public class RestControllerBugData {
    private static final List<BugDataTemporary> BUG_DATA_TEMPORARIES = List.of(
            new BugDataTemporary("Venus", "Red", 1),
            new BugDataTemporary("Dizzy", "Blue", 2),
            new BugDataTemporary("Runner", "Green", 3),
            new BugDataTemporary("SmackLol", "Yellow", 4)
    );

    @GetMapping
    public List<BugDataTemporary> getBugData(){
        return BUG_DATA_TEMPORARIES;
    }

}
