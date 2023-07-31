public class Start {
    public static void main(String[] args) {
        String text = "Exeercisessss such aaaaas lifffting wwweights";

        String compressText = "Exe2rcises4 such a5s lif3ting w3eights";

        Compression compression = new Compression();
        System.out.println(compression.compressText(text));

        Decompression decompression = new Decompression();
        System.out.println(decompression.decompressText(compressText));
    }
}
