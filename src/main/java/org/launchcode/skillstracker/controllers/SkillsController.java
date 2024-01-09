package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class SkillsController {

    //At localhost:8080, add text that states the three possible programming languages someone could be working on.
    // You need to have a h1 with the title “Skills Tracker”, a h2, and an ol containing three programming languages
    // of your choosing.
    @GetMapping("/")
    public String langList() {
        return "<html>" +
                "<body>" +
                "<h1>Skills Tracker</h1>" +
                "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                "<ol>" +
                "<li>Java</li>" +
                "<li>JavaScript</li>" +
                "<li>Golang</li>" +
                "</ol>" +
                "<p>Click <a href='/form'>here</a> to select your favorite</p>" +
                "</body>" +
                "</html>";
    };


    //At localhost:8080/form, add a form that lets the user enter their name and choose their favorite, second favorite,
    // and third favorite programming languages on your list. Use select elements for each of the rankings. Just as with
    // the exercises, we will use @GetMapping()
    // Responds to get and post requests at /hello?coder=LaunchCoder


    @GetMapping("/form")
    public String form() {
        return
                "<html>" +
                "<body>" +
                "<form action='/form' method='POST'>" +
                "<label>Name:</label>" +
                "<input type='text' name='userName' /><br />" +
                "<label>My Favorite Language:</label>" +
                "<select name='fave1'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Golang'>Golang</option>" +
                "</select><br />" +
                "<label>My Second Favorite Language:</label>" +
                "<select name='fave2'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Golang'>Golang</option>" +
                "</select><br />" +
                "<label>My Third Favorite Language:</label>" +
                "<select name='fave3'>" +
                "<option value='Java'>Java</option>" +
                "<option value='JavaScript'>JavaScript</option>" +
                "<option value='Golang'>Golang</option>" +
                "</select><br />" +
                "<input type='submit' value='Submit' />" +
                "</form>" +
                "</body>" +
                "</html>";
    }



    //Also at localhost:8080/form, use @PostMapping and @RequestParam to update the HTML with a h1 stating the user’s
    // name and an ol showing the three programming languages in the order they chose.

    @PostMapping("/form")
    public String processFormPlease(@RequestParam String userName, String fave1, String fave2, String fave3) {
        return  "<html>" +
                "<body>" +
                "<h1>" + userName + "</h1>" +
                "<h3>Favorite Languages</h3>" +
                "<ol>" +
                "<li>" + fave1 + "</li>" +
                "<li>" + fave2 + "</li>" +
                "<li>" + fave3 + "</li>" +
                "<ol>" +
                "</body>" +
                "</html>";
    }

}
