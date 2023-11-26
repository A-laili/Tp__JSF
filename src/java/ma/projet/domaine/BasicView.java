package ma.projet.domaine;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean(name = "treeBasicView")
@ViewScoped
public class BasicView {

    private TreeNode root;

    @PostConstruct
    public void init() {
        root = new DefaultTreeNode("Root", null);
        TreeNode node0 = new DefaultTreeNode("Info", root);
        TreeNode node1 = new DefaultTreeNode("Finance", root);
        TreeNode node2 = new DefaultTreeNode("Marketing", root);

        TreeNode node00 = new DefaultTreeNode("Manager", node0);
        TreeNode node01 = new DefaultTreeNode("Alami", node1);
       TreeNode node02 = new DefaultTreeNode("Ziyach", node2);

        node00.getChildren().add(new DefaultTreeNode("Laili"));
        node00.getChildren().add(new DefaultTreeNode("Asmaa"));
        node01.getChildren().add(new DefaultTreeNode("madame"));
       node02.getChildren().add(new DefaultTreeNode("zz"));
       
    }

    public TreeNode getRoot() {
        return root;
    }
}
