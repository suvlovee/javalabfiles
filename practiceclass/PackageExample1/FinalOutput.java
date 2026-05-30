
import Branch.BranchFile;
import Branch.Child.ChildFile;

public class FinalOutput {
    public static void main(String[] args) {
        BranchFile branch = new BranchFile();
        ChildFile child = new ChildFile();

        System.out.println("Branch Name: " + branch.getBranchName());
        System.out.println("Branch Code: " + branch.getBranchCode());
        System.out.println("Child Name: " + child.getChildName());
        System.out.println("Child Age: " + child.getChildAge());
    }
}