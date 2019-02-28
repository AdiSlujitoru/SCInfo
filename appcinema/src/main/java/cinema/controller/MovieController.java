package cinema.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;
import cinema.bean.Movie;

import javax.servlet.http.HttpSession;

@Controller
@SessionAttributes("movie")
public class MovieController {

    
    @RequestMapping(value = "/movies", method = RequestMethod.GET)
    public ModelAndView viewMovies(Model model, HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        model.addAttribute("movie", new Movie());

//        ResponseEntity<Movie[]> responseEntity =
//                restTemplate.getForEntity("http://localhost:8085/movies/", Movie[].class);
//        int statusCode = responseEntity.getStatusCodeValue();
//
////        Customer customer = (Customer) session.getAttribute("customer");
//
//
//        if ( null !=  session.getAttribute("customer")) {
//            System.out.println(session.getAttribute("customer"));
//            modelAndView.setViewName("movieslogin");
//        }else
//            modelAndView.setViewName("movies1");
//
//
//        if (statusCode >= 200 && statusCode <= 299) {
//            Movie[] movies = responseEntity.getBody();
//            modelAndView.addObject("moviesArray", movies);
//
//        }else {
//            modelAndView.addObject("Server is temporarily down");
//        }


        Movie[] movies= new Movie[]{
                new Movie("Jigsaw","Matt Passmore, Tobin Bell, Callum Keith","Crime,Horror,Mystery","92 min","https://images-na.ssl-images-amazon.com/images/M/MV5BNmRiZDM4ZmMtOTVjMi00YTNlLTkyNjMtMjI2OTAxNjgwMWM1XkEyXkFqcGdeQXVyMjMxOTE0ODA@._V1_SY1000_CR0,0,648,1000_AL_.jpg"),
                new Movie("Blade Runner 2049", "Ryan Gosling, Dave Bautista, Robin Wrigth","Drama, Mystery", "164 min", "https://images-na.ssl-images-amazon.com/images/M/MV5BNzA1Njg4NzYxOV5BMl5BanBnXkFtZTgwODk5NjU3MzI@._V1_SY1000_CR0,0,674,1000_AL_.jpg"),
                new Movie("The Foreigner","Katie Leung, Jackie Chan, Rufus Jones","Action, Crime, Drama", "113 min", "https://images-na.ssl-images-amazon.com/images/M/MV5BM2RlMjcyMGQtZTU3OC00NGRlLWExMGEtYjU3ZjUyMDc0NWZmXkEyXkFqcGdeQXVyNTI4MzE4MDU@._V1_SY1000_SX675_AL_.jpg"),
                new Movie("It","Jaeden Lieberher, Jeremy Ray Taylor, Sophia Lillis","Horror, Thriller", "135 min", "https://images-na.ssl-images-amazon.com/images/M/MV5BOTE0NWEyNDYtYWI5MC00MWY0LTg1NDctZjAwMjkyMWJiNzk1XkEyXkFqcGdeQXVyNjk5NDA3OTk@._V1_SY1000_CR0,0,674,1000_AL_.jpg"),
                new Movie("The Mountain Between Us", "Idris Elba, Kate Winslet","Action, Adventure, Drama", "112 min", "https://images-na.ssl-images-amazon.com/images/M/MV5BMjAxNjQzMDk5NV5BMl5BanBnXkFtZTgwNjI0NjM2MjI@._V1_SY1000_CR0,0,674,1000_AL_.jpg"),
                new Movie("American Made","Tom Cruise, Sarah Wright","Action, Biography, Comedy", "115 min", "https://images-na.ssl-images-amazon.com/images/M/MV5BMTUxNzUwMjk1Nl5BMl5BanBnXkFtZTgwNDkwODI1MjI@._V1_SY1000_CR0,0,675,1000_AL_.jpg"),

        };
        modelAndView.setViewName("movies1");
        modelAndView.addObject("moviesArray", movies);


        return modelAndView;

    }

   /* @RequestMapping(value = "/bookmovie", method = RequestMethod.POST)
    public ModelAndView bookMovie(@ModelAttribute("movie") Movie movie, Model model) {
        ModelAndView modelAndView = new ModelAndView("theatre1");
        model.addAttribute(new Theatre());


//        ResponseEntity<Theatre[]> responseEntity =
//                restTemplate.postForEntity("http://localhost:8085/theatres", movie, Theatre[].class);
//        int statusCode = responseEntity.getStatusCodeValue();
//
//        if (statusCode >= 200 && statusCode <= 299) {
//            Theatre[] theatres = responseEntity.getBody();
//            modelAndView.addObject("theatres", theatres);
//        }else
//            modelAndView.addObject("Server is temporarily down");

            Theatre[] theatres = new Theatre[]{
                    new Theatre("Vivo","Cluj Napoca",3131,"13:30"),
        };
        modelAndView.addObject("theatres", theatres);
        return modelAndView;
    }






}


	/*
	 * @RequestMapping(value = "/movies", method = RequestMethod.GET) public
	 * ModelAndView viewMovies(Model model, HttpSession session) { ModelAndView
	 * modelAndView = new ModelAndView(); model.addAttribute("movie", new Movie());
	 * 
	 * ResponseEntity<Movie[]> responseEntity =
	 * restTemplate.getForEntity("http://localhost:8080/movies", Movie[].class); int
	 * statusCode = responseEntity.getStatusCodeValue();
	 * 
	 * Customer customer = (Customer) session.getAttribute("customer");
	 * 
	 * if (null != session.getAttribute("customer")) {
	 * System.out.println(session.getAttribute("customer"));
	 * modelAndView.setViewName("movieslogin"); } else
	 * modelAndView.setViewName("movies1");
	 * 
	 * if (statusCode >= 200 && statusCode <= 299) { Movie[] movies =
	 * responseEntity.getBody(); modelAndView.addObject("moviesArray", movies);
	 * 
	 * } else { modelAndView.addObject("Server is temporarily down"); }
	 * 
	 * return modelAndView;
	 * 
	 * }
	 * 
	 * @RequestMapping(value = "/bookmovie", method = RequestMethod.POST) public
	 * ModelAndView bookMovie(@ModelAttribute("movie") Movie movie, Model model) {
	 * ModelAndView modelAndView = new ModelAndView("cinema1");
	 * model.addAttribute(new Cinema());
	 * 
	 * ResponseEntity<Cinema[]> responseEntity =
	 * restTemplate.postForEntity("http://localhost:8080/cinema", movie,
	 * Cinema[].class); int statusCode = responseEntity.getStatusCodeValue();
	 * 
	 * if (statusCode >= 200 && statusCode <= 299) { Cinema[] cinemas =
	 * responseEntity.getBody(); modelAndView.addObject("cinema", cinemas); } else
	 * modelAndView.addObject("Server is temporarily down");
	 * 
	 * return modelAndView; }
	 */

}
