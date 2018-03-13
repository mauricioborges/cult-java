package hello;

import javax.swing.text.Style;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class TextStyleLogic {
    public List<String> styles = Arrays.asList("estilo 1", "estilo 2");
    
    //Escolhe um estilo
    public void chooseStyle(String estilo){
        String expectedStyle = "estilo 2";
        String styleChosen = "estilo 2";
        String choice = Style.chooseStyle(expectedStyle,styleChosen);
        expectedStyle.equals(styleChosen);


    }
    //Quais os estilos e quantas vezes cada um foi escolhido
    public HashMap<String, Integer> choosenStyles() {
        //????
        return new HashMap<String, Integer>();
    }
}
