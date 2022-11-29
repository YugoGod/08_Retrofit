package hugo.monton.blanco.a08_retrofit.conexiones;

import java.util.ArrayList;

import hugo.monton.blanco.a08_retrofit.modelos.Album;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiConexiones {

    // Todos los 'endPoints' y 'retornos' de la API

    @GET("/albums") // 'get' (es un select) al 'endPoint' de '/albums'.
    Call<ArrayList<Album>> getAlbums(); // Call<> (Retrofit), es lo que devuelve el Retrofit, y lo pedimos de tipo ArrayList<Album>.

    @GET("/albums/{idAlbum}") // El idAlbum tendrá que ser parámetro que se le pase a la función 'getAlbum(@Path("idAlbum") int idAlbum)'.
    Call<Album> getAlbum(@Path("idAlbum") String idAlbum); // Retornará un 'Call' de un 'Album'. Path() = String.
}
