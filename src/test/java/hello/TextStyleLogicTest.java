package hello;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TextStyleLogicTest {
    @Test
    public void pickOneAndMakeItWork() throws Exception {
        TextStyleLogic logic = new TextStyleLogic();
        logic.chooseStyle("estilo um");
        logic.chooseStyle("estilo um");
        logic.chooseStyle("estilo um");
        logic.chooseStyle("estilo dois");
        assertEquals( new Integer(3), logic.choosenStyles().get("estilo um"));
        assertEquals( new Integer(1),logic.choosenStyles().get("estilo dois"));

    }


}
