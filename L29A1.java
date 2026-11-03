import java.util.*;

class L29A1{
    public static void outputs(int curr, int[] arr, List<Integer> subarr, List<List<Integer>> res){
        if (curr >= arr.length){
            res.add(new ArrayList<>(subarr));

            return;
        }

        subarr.add(arr[curr]);

        outputs(curr + 1,arr,subarr,res);
        
        subarr.remove(subarr.size() - 1);

        outputs(curr + 1,arr,subarr,res);
    }

    public static void main(String[] args) {
        int[] array = {1,2,3};
        List<Integer> subarr = new ArrayList<Integer>();
        List<List<Integer>> res = new ArrayList<List<Integer>>();

        outputs(0, array, subarr, res);

        for (int i = 0; i < res.size(); i++){
            for (int k = 0; k < res.get(i).size(); k++){
                System.out.print(res.get(i).get(k));
            }
            System.out.println();
        }
    }
}