package giphy.pikachu.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import giphy.pikachu.Models.DataObject;
import giphy.pikachu.Services.DataService;

@Controller
public class DataController {
    @Autowired
    private DataService dataservice;

    @GetMapping(value="/")
    public String initForm(Model model){
        DataObject data = new DataObject();
        model.addAttribute("data", data);
        return "form";
    }

    @PostMapping(value="/add")
    public String addData(Model model, @ModelAttribute("data") DataObject data){
        int statusCode = dataservice.addToDb(data);
        if (statusCode == 200){
            return "result";
        }
        else {
            return "invalid";
        }
    }
}
