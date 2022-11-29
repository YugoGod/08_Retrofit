package hugo.monton.blanco.a08_retrofit.modelos;

import com.google.gson.annotations.SerializedName;

public class Album {
    // ATRIBUTOS
    private int userId;
    private int id;
    @SerializedName(value = "title") // Cuando se vaya a leer se llama 'title' (buscarlo en la API), y cuando vas a serializarlo llamalo 'title' (guardarlo en la API).
    private String titulo;

    // COSNTRUCTORES

    public Album() {
    }

    // GETTERS AND SETTERS
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // MÉTODOS GENÉRICOS O PROPIOS

}
