import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 순위 {
    public int solution(int n, int[][] results) {
        Map<Integer, HashSet<Integer>> win = new HashMap<>();
        Map<Integer, HashSet<Integer>> lose = new HashMap<>();

        for(int i = 0;i < results.length; i++){
            int winner = results[i][0];
            int loser = results[i][1];
            if (win.containsKey(winner)){ //이전에 이미 있음
                HashSet<Integer> t_win = win.get(winner);
                t_win.add(loser);
                win.replace(winner, t_win);
            }else{  //이전에 없음
                HashSet<Integer> tmp = new HashSet<>();
                tmp.add(loser);
                win.put(winner, tmp);
            }

            if(lose.containsKey(loser)){
                HashSet<Integer> t_lose = lose.get(loser);
                t_lose.add(winner);
                lose.replace(loser, t_lose);
            }else{
                HashSet<Integer> tmp = new HashSet<>();
                tmp.add(winner);
                lose.put(loser, tmp);
            }
        }

        for(int i = 1;i <= n; i++){
            if (win.containsKey(i)){
                for(int j : win.get(i)){
                    if (lose.containsKey(i)){
                        HashSet<Integer> t = lose.get(i);
                        if (lose.containsKey(j)){
                            HashSet<Integer> s = lose.get(j);
                            s.addAll(t);
                            lose.put(j,s);
                        } else{
                            lose.put(j,t);
                        }
                    }
                }
            }
            if (lose.containsKey(i)){
                for(int j : lose.get(i)){
                    if(win.containsKey(i)){
                        HashSet<Integer> t = win.get(i);
                        if(win.containsKey(j)){
                            HashSet<Integer> s = win.get(j);
                            s.addAll(t);
                            win.put(j,s);
                        }else{
                            win.put(j,t);
                        }
                    }
                }
            }
        }
        int answer = 0;

        for (int i = 1;i <= n; i++){
            int total = 0;
            if (win.containsKey(i)){
                total += win.get(i).size();
            }
            if (lose.containsKey(i)){
                total += lose.get(i).size();
            }
            if (total == n - 1) answer++;
        }


        return answer;
    }
}
