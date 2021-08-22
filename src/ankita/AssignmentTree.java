package ankita;

public class AssignmentTree {

		int getvisibleTree(int[] arr) {
			int maxtreeheight = 0 ;
			int visibletrees = 0;
			for (int index= 0; index<arr.length; index++) {
				int current_tree_height = arr[index];
				if(maxtreeheight<current_tree_height) {
					maxtreeheight= current_tree_height;
					visibletrees++;
				}
			}
			return visibletrees;
		}

		public static void main(String[] args) {
			int[] treeheight= {3,5,5,11,9,10,15,14};
			AssignmentTree assignmenttree = new AssignmentTree();
			int visibletrees = assignmenttree.getvisibleTree(treeheight);
			System.out.println("visible tree are "+visibletrees);
		}
	}

