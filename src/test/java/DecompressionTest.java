import org.junit.Assert;
import org.junit.Test;

public class DecompressionTest {

    @Test
    public void decompressText() {
        Decompression decompression = new Decompression();
        String text = decompression.decompressText("Exe2rcises4 such a5s lif3ting w3eights");
        String result = "Exeercisessss such aaaaas lifffting wwweights";
        Assert.assertEquals(text, result);
    }

    @Test
    public void decompressText2() {
        Decompression decompression = new Decompression();
        String text = decompression.decompressText("h5el2o wo3rld");
        String result = "hhhhhello wooorld";
        Assert.assertEquals(text, result);
    }

    @Test
    public void decompressText3() {
        Decompression decompression = new Decompression();
        String text = decompression.decompressText("What4 is a Regu3lar Expres2i6on?");
        String result = "Whatttt is a Reguuular Expressiiiiiion?";
        Assert.assertEquals(text, result);
    }
}