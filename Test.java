
/**
 * Permite probar los métodos checkIndex, validIndex, listFile y removeFile sin tener que usar 
 * la interfaz de BlueJ.
 */
public class Test
{
    private MusicOrganizer test;
    /**
     * Constructor para objetos de la clase test.
     */
    public Test()
    {
        test = new MusicOrganizer();
    }
    
    /**
     * Invoca automáticamente los métodos checkIndex, validIndex, listFile y removeFile.
     */
    public void test()
    {
        test.addFile("TestFile1.mp3");
        test.addFile("TestFile2.mp3");
        test.addFile("TestFile3.mp3");
        
        test.checkIndex(0);
        test.checkIndex(10);
        
        test.validIndex(0);
        test.validIndex(10);
        
        test.listFile(0);
        test.listFile(10);
        
        test.removeFile(0);
        test.removeFile(10);
        
        test.listFile(0);
    }
}
