package com.emna.cosmetiques.controllers;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.emna.cosmetiques.entities.Cosmetique;
import com.emna.cosmetiques.service.CosmetiqueService;

@Controller
public class CosmetiqueController {
	
@Autowired
CosmetiqueService cosmetiqueService;

@RequestMapping("/showCreate")
public String showCreate()
{
return "createCosmetique";
}

@RequestMapping("/saveCosmetique")
public String saveCosmetique(@ModelAttribute("cosmetique") Cosmetique cosmetique,
 @RequestParam("date") String date,
 ModelMap modelMap) throws
ParseException
{
//conversion de la date
 SimpleDateFormat dateformat = new SimpleDateFormat("yyyy-MM-dd");
 Date dateCreation = dateformat.parse(String.valueOf(date));
 cosmetique.setDateCreation(dateCreation);


}