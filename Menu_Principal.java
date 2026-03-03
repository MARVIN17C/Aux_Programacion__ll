// MAIN PRINCIPAL
public class Proyejercicios {
    public static void main(String[] args){
        Anime anime1 = new Anime("Bleach","shonen",366);
        Anime anime2 = new Anime("Cyberpunk edgerunners","ciencia ficcion",10);
        System.out.println("---------------------------LOS ANIMES SON-------------------------");
        System.out.println(anime1);
        System.out.println(anime2);

        Televisor tele1 = new Televisor();
        Televisor tele2 = new Televisor("Huawei",1280,"Oled");
        System.out.println("-----------------------LAS TELEVISIONES SON-----------------------");
        System.out.println(tele1);
        System.out.println(tele2);

        Instrumento instru1 = new Instrumento("Ukulele","madera","cuerda pulsada");
        Instrumento instru2 = new Instrumento("Piano","madera,metal,teclas","percusion");
        System.out.println("---------------------LOS INSTRUMENTOS SON-------------------------");
        System.out.println(instru1);
        System.out.println(instru2);
    }
}
