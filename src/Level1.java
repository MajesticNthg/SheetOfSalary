public class Level1 {

    public static int [] SynchronizingTables(int N, int [] ids, int [] salary) {

        int[] sort_ids = new int[N];
        int[] sort_salary = new int[N];

        for(int i = 0; i < N; i ++)
            sort_ids[i] = ids[i];

        for(int i = 0; i < N; i ++)
            sort_salary[i] = salary[i];

        boolean xchange = true;
        int x;

        while(xchange) {
            xchange = false;

            for(int i = 0; i < N - 1; i ++)
                if(sort_ids[i] > sort_ids[i+1]) {
                    x = sort_ids[i];
                    sort_ids[i] = sort_ids[i+1];
                    sort_ids[i+1] = x;

                    xchange = true;
                }
        }

        xchange = true;
        while(xchange) {
            xchange = false;

            for(int i = 0; i < N - 1; i ++)
                if(sort_salary[i] > sort_salary[i+1]) {
                    x = sort_salary[i];
                    sort_salary[i] = sort_salary[i+1];
                    sort_salary[i+1] = x;

                    xchange = true;
                }
        }

        int[][] all_Massive = new int[N][2];

        for (int i = 0; i < N; i++) {
            all_Massive[i][0] = sort_ids[i];
            all_Massive[i][1] = sort_salary[i];
        }

        ;
        for (int y = 0; y < N; y++)
            for (int z = 0; z < N; z++)
                if (ids[y] == sort_ids[z]) {
                    salary[y] = sort_salary[z];
                }


        return salary;

    }

}