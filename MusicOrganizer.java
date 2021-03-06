import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    private boolean indvalido;
        
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(indvalido = true) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(indvalido = true) {
            files.remove(index);
        }
    }
    
    /**
     * Comprueba si el valor introducido es un �ndice v�lido.
     */
    public void checkIndex(int index)
    {
        if (index < 0 || index > files.size())
        {
            System.out.println("El valor no est� en un rango v�lido");
        }
    }
    
    /**
     * Asignamos a un boolean un valor true si el �ndice es valido.
     */
    public void validIndex(int index)
    {
        if(index >= 0 && index < files.size())
        {
            indvalido = true;
        }
        else
        {
            indvalido = false;
        }
    }
}
