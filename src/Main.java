import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /*
        // fájl olvasóval beolvassuk a sorokat
        // példányosítunk egy szekrényt
        // soronként belerakjuk a szekrénybe a sorokból példányosított ruhákat
        switch ("") {
            case "tshirt" -> // létrehozol egy pólót
                            // hozzáadom a pólót a szekrényhez, a listához
        }
        // különböző feladatokat ellátó metódusokat meghívunk a szekrény
         */

        List<String> linesClothes = FileReadHandler.fileReadHandler("res/clothes.txt");
        List<Cupboard> cupboards = new ArrayList<>();

        for (String line : linesClothes) {
            String[] lineAsArray = line.split(",");
            switch (lineAsArray[0]) {
                case "póló" -> cupboards.add(new Tshirt(
                        Gender.valueOf(lineAsArray[1].toUpperCase()),
                        Condition.valueOf(lineAsArray[2].toUpperCase()),
                        lineAsArray[3],
                        Boolean.parseBoolean(lineAsArray[4].toUpperCase())
                ));
                case "ing" -> cupboards.add(new Shirt(
                        Gender.valueOf(lineAsArray[1].toUpperCase()),
                        Condition.valueOf(lineAsArray[2].toUpperCase()),
                        Boolean.parseBoolean(lineAsArray[3])
                ));



            }
        }

    }
}