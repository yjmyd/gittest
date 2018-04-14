package liudan.archetype.gittest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liudan@huimin100.cn
 * @Title HomeController
 * @Description:
 * @Copyright: Copyright (c) 2018
 * @Company: huimin.cn
 * @Created on 2018/4/14 14:04
 */
@RestController
public class HomeController {


  @RequestMapping("/")
  public String home(){
    return "home";
  }

}
