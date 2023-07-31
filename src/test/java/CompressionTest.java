import org.junit.Assert;
import org.junit.Test;

public class CompressionTest {

    @Test
    public void compressText() {
        Compression compression = new Compression();
        String text = compression.compressText("Exeercisessss such aaaaas lifffting wwweights");
        String result = "Exe2rcises4 such a5s lif3ting w3eights";
        Assert.assertEquals(result, text);
    }

    @Test
    public void compressText1() {
        Compression compression = new Compression();
        String text = compression.compressText("hhhhhello wooorld");
        String result = "h5el2o wo3rld";
        Assert.assertEquals(result, text);
    }

    @Test
    public void compressText3() {
        Compression compression = new Compression();
        String text = compression.compressText("Whatttt is a Reguuular Expressiiiiiion?");
        String result = "What4 is a Regu3lar Expres2i6on?";
        Assert.assertEquals(result, text);
    }
}