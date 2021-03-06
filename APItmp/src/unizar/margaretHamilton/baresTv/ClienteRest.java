package unizar.margaretHamilton.baresTv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ClienteRest {
	
    private final String URI = "http://localhost:8080/unizar.margarethamilton.baresTvServicio/rest";
    
    /**
     * @return lista de diccionarios de todos los bares y sus detalles
     *         ordenados alfabéticamente (a-z) por nombre del bar
     */
    public List<HashMap<String, String>> getBares() {
    	List<HashMap<String, String>> bares = new ArrayList<HashMap<String, String>>();
    	
    	{
    	HashMap<String, String> bar = new HashMap<String, String>();
    	bar.put("nickbar", "bardeprueba");
    	bar.put("nombre", "Bar de Manolo");
    	bar.put("descrbar", "Las peores tapas, más caras que nunca.");
    	bar.put("activado", "1");
    	bar.put("lat", "41.65111400");
    	bar.put("lng", "-0.89438000");
    	bar.put("direccion", "Calle La Mala Muerte");
    	bar.put("urlimagen", "https://encrypted.google.com/images/branding/googlelogo/2x/googlelogo_color_120x44dp.png");
    	bares.add(bar);
    	}
    	{
    	HashMap<String, String> bar = new HashMap<String, String>();
    	bar.put("nickbar", "barejemplo");
    	bar.put("nombre", "Un bar de ejemplo");
    	bar.put("descrbar", "El mejor bar de tapas de ejemplo, con la mejor programación de ejemplo.");
    	bar.put("activado", "0");
    	bar.put("lat", "41.65111400");
    	bar.put("lng", "-0.89438000");
    	bar.put("direccion", "Calle Manuel Escoriaza y Fabro, 51 - 50010 Zaragoza");
    	bar.put("urlimagen", "https://media-cdn.tripadvisor.com/media/photo-s/09/1e/e2/45/la-fusteria-bar-de-tapas.jpg");
    	bares.add(bar);
    	}
    	
    	return bares;
    }
    
    /**
     * @param nickbar
     * @return diccionario con los detalles de un bar con nick nickbar; estará
     *         vacío si el nick no corresponde a ningún bar
     */
    public HashMap<String, String> getBarDadoNick(String nickbar) {
    	HashMap<String, String> bar = new HashMap<String, String>();
    	return bar;
    }
    
    /**
     * @return lista de todas las categorías existentes
     */
    public List<String> getCategorias() {
    	List<String> cats = new ArrayList<String>();

    	cats.add("toros");
    	cats.add("fútbol");
    	
    	return cats;
    }
    
    /**
     * @return lista de diccionarios de todos los programas presentes o futuros
     *         y sus detalles ordenados de más próximos a más lejanos en el tiempo
     */
    public List<HashMap<String, String>> getProgramacion() {
    	List<HashMap<String, String>> programas = new ArrayList<HashMap<String, String>>();
    	return programas;
    }
    
    /**
     * @return lista de diccionarios de todos los programas presentes o futuros
     *         que se expondrán en un bar y sus detalles ordenados de más
     *         próximo a más lejano en el tiempo
     */
    public List<HashMap<String, String>> getProgramacionDadoBar(String nickbar) {
    	List<HashMap<String, String>> programas = new ArrayList<HashMap<String, String>>();
    	
    	return programas;
    }
    
    /**
     * @return lista de diccionarios de todos los programas presentes o futuros
     *         marcados como destacados y sus detalles ordenados de más
     *         próximos a más lejanos en el tiempo
     */
    public List<HashMap<String, String>> getProgramacionDestacada() {
    	List<HashMap<String, String>> programas = new ArrayList<HashMap<String, String>>();
    	return programas;
    }
    
    /**
     * @return lista de diccionarios de todos los usuarios registrados y sus
     *         detalles ordenados alfabéticamente (a-z) por nick
     */
    public List<HashMap<String, String>> getUsuarios() {
    	List<HashMap<String, String>> usuarios = new ArrayList<HashMap<String, String>>();
    	return usuarios;
    }
    
    /**
     * @param nick
     * @param clave nueva contraseña
     * @param permisos 0 = usuario limitado; 1 = administrador
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean setUsuario(String nick, String clave, Boolean permisos) {
    	return false;
    }
    
    /**
     * @param nickbar
     * @param nombre
     * @param descrbar
     * @param activado 0 = deshabilitado; 1 = habilitado
     * @param lat
     * @param lng
     * @param direccion
     * @param urlimagen
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean setBar(String nickbar, String nombre,
    		           String descrbar, Boolean activado,
    		           String lat, String lng,
    		           String direccion, String urlimagen) {
    	return false;
    }
    
    /**
     * 
     * @param titulo
     * @param bar
     * @param descr
     * @param destacado 0 = no; 1 = sí
     * @param inicio
     * @param fin
     * @param cat
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean setPrograma(String titulo, String bar,
    		                String descr, Boolean destacado,
    		                String inicio, String fin,
    		                String cat) {
    	return false;
    }
    
    /**
     * Renombra una categoría.
     * @param viejaCat
     * @param nuevaCat
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean renombrarCategoria(String viejaCat, String nuevaCat) {
    	return false;
    }
    
    /**
     * Crea una categoría.
     * @param cat
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean crearCategoria(String cat) {
    	return false;
    }
    
    /**
     * Borra una categoría.
     * @param cat
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean borrarCategoria(String cat) {
    	return false;
    }
    
    /**
     * Borra un usuario. En caso de ser un bar, borra también
     * el establecimiento como tal con toda su información.
     * @param nick
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean borrarUsuario(String nick) {
    	return false;
    }
    
    /**
     * Borra un programa.
     * @param titulo
     * @param bar
     * @return true si todo ha ido bien, falso en caso contrario
     */
    public Boolean borrarPrograma(String titulo, String bar) {
    	return false;
    }
}
