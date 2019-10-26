@Controller
class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "This is the landing page!";
    }

}