package fit.ssr.imccalc.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import fit.ssr.imccalc.helpers.ImcLayersFactory;
import fit.ssr.imccalc.models.ImcLayer;
import fit.ssr.imccalc.models.Person;

@Controller
@RequestMapping("/imc")
public class ImcController {
    private List<ImcLayer> layers;

    public ImcController() {
        super();
        this.layers = ImcLayersFactory.createImcLayerList();
    }

    @RequestMapping(value="/")
    public String index(Model model) {
        model.addAttribute("layers", this.layers);
        model.addAttribute("person", new Person());

        return "index";
    }
}
