package adv.web.hcc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;

@Controller
public class FlowerController {

    @Autowired
    private IFlowerService flowerService;

    @GetMapping("/flowers")
    public ModelAndView getFlowers() {

        var Flowers = (List<Flower>) flowerService.findAll();

        var params = new HashMap<String, Object>();
        params.put("flowers", Flowers);

        return new ModelAndView("showFlowers", params);
    }

}
