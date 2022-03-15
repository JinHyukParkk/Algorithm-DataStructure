import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;


class GiveDeclarationResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고한 유저 리스트 : id_list 
        // 신고 기록 : report ([신고한 유저] [신고 당한 사람])  ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
        // 정지될 신고 개수 : k

        HashMap<String, ArrayList<String>> declareList = new HashMap<String, ArrayList<String>>();
        HashMap<String, Integer> stopList = new HashMap<>();
        ArrayList<String> stopUser = new ArrayList<>();
        int[] result = new int[id_list.length];

        for (String repo : report) {
            String[] parseRepo = repo.split("\\s+");

            // 신고한 사람
            String deUser = parseRepo[0];           // muzi
            // 신고 당한 사람
            String declaredUser = parseRepo[1];     // frodo

            // hashmap 값이 아무것도 없을 때 초기 선언
            if (declareList.get(deUser) == null) {
                declareList.put(deUser, new ArrayList<>());
            }

            // 신고한 사람의 신고 리스트를 불러와서 추가하고, '신고 리스트 자료형'에 넣는 로직
            ArrayList<String> list = declareList.get(deUser);
            list.add(declaredUser);
            declareList.put(deUser, list);  
            
            // 신고 당한 사람의 신고 수 넣는 로직
            if (stopList.get(declaredUser) == null) {
                stopList.put(declaredUser, 1);
            } else {
                int declareCount = stopList.get(declaredUser);
                stopList.put(declaredUser, declareCount + 1);
            }
        }

        // 정지 당한 유저 ArrayList 넣는 로직
        Iterator<String> keys = stopList.keySet().iterator();

        while (keys.hasNext()) {
            String key = keys.next();
            int count = stopList.get(key);
            if (count >= 2) {
                stopUser.add(key);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            int count = 0;

            if (declareList.get(id_list[i]) == null) continue;

            ArrayList<String> list = declareList.get(id_list[i]);

            for (String declareId : list) {
                // 정지한 유저가 있는지
                if (stopUser.contains(declareId)) {
                    count++;
                }

            }

            result[i] = count;
        }

        return result;
    }

    public static void main(String[] args) {
        GiveDeclarationResult giveDeclarationResult = new GiveDeclarationResult();

        String[] givenIdList = {"muzi", "frodo", "apeach", "neo"};
        String[] givenReport = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; // muzi, apeach, frodo 
        int k = 2;

        int[] result = giveDeclarationResult.solution(givenIdList, givenReport, k);
        
        for (int i : result) {
            System.out.println(i);
        }
    }
}


/*
1. '신고한 유저, 신고 당한 유저들' - 신고 리스트 자료형
 => 저장함

2. 정지된 유저 리스트 (2번 이상 신고) k = 2
 => 1번 자료에서 데이터를 넣을 때마다 
 => ArrayList<String> , contains 함수 이용

3. 처리 결과 메일 받은 수 리스트 (Result)
 = > int[]
*/