package adv.web.hcc;

import java.sql.SQLException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SpringBootApplication
@RestController
public class MidtermApplication {

	@Autowired
    FlowerRepo fr;

	public MidtermApplication() throws SQLException {
	}

	public static void main(String[] args) {
		SpringApplication.run(MidtermApplication.class, args);
	}

	//Website URL
	@RequestMapping({"/"})
	public ModelAndView index() throws SQLException {
		ModelAndView mav = new ModelAndView("/index");
		return mav;
	}

	@GetMapping({"/Inventory"})
	public ModelAndView inventory() {
		ModelAndView mav = new ModelAndView("/InventoryManagement");
		mav.addObject("flowers", this.fr.findAll());
		return mav;
	}

	@RequestMapping({"/Remove"})
	public ModelAndView remove(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView("/InventoryManagement");
		this.fr.deleteById(id);
		mav.addObject("flowers", this.fr.findAll());
		return mav;
	}

	@RequestMapping({"/Edit"})
	public ModelAndView edit(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView("/EditPage");
		Flower flower = (Flower)this.fr.findById(id).get();
		mav.addObject("Id", flower.getId());
		mav.addObject("Img", flower.getImg());
		mav.addObject("Name", flower.getName());
		mav.addObject("Quantity", flower.getQuantity());
		return mav;
	}

	@RequestMapping({"/Edited"})
	public ModelAndView edited(@RequestParam("id") String id, @RequestParam("img") String img, @RequestParam("name") String name, @RequestParam("quantity") String quantity) {
		ModelAndView mav = new ModelAndView("/InventoryManagement");
		Flower flower = (Flower)this.fr.findById(id).get();
		flower.setImg(img);
		flower.setName(name);
		flower.setQuantity(Integer.parseInt(quantity));
		this.fr.save(flower);
		mav.addObject("flowers", this.fr.findAll());
		return mav;
	}

	@RequestMapping({"/New"})
	public ModelAndView tonew() {
		ModelAndView mav = new ModelAndView("/CreateFlower");
		return mav;
	}

	@RequestMapping({"/Create"})
	public ModelAndView create(@RequestParam("id") String id, @RequestParam("img") String img, @RequestParam("name") String name, @RequestParam("quantity") String quantity) {
		ModelAndView mav = new ModelAndView("/InventoryManagement");
		Flower flower = new Flower();
		flower.setId(id);
		flower.setImg(img);
		flower.setName(name);
		flower.setQuantity(Integer.parseInt(quantity));
		this.fr.save(flower);
		mav.addObject("flowers", this.fr.findAll());
		return mav;
	}



}


