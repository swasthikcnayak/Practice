import java.util.Arrays;
import java.util.List;


/**
 * This is the impelementaiton of the fileystem which is the typical use case of the composite design pattern
 * Each of the directory can have file and more directories, 
 * file sytem is the interface that provides with the functions that has to be implemented by all the componetns of the filesytem
 * Also in the compsite pattern all the objects belong to same/similar interface.F
 */

interface FileSystem {
    public String ls();
}

class File implements FileSystem {
    String filename;

    public File(String filename) {
        this.filename = filename;
    }

    public String ls() {
        return "File: " + filename;
    }
}

class Directory implements FileSystem {
    String dirName;
    List<FileSystem> dirs;

    public Directory(String dirName, List<FileSystem> dirs) {
        this.dirName = dirName;
        this.dirs = dirs;
    }

    public String ls() {
        StringBuilder ans = new StringBuilder();
        ans.append("Directory: " + dirName + "\n");
        for (FileSystem dir : dirs) {
            ans.append(dir.ls() + "\n");
        }
        return ans.toString();
    }
}

class Main {
    public static void main(String[] args) {
        FileSystem internal = new File("internal.txt");
        FileSystem emptyDir = new Directory("empty", null);
        FileSystem fs = new Directory("root", Arrays.asList(internal, emptyDir));
        System.out.println(fs.ls());
    }
}