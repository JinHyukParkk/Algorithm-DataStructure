import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class GiveDeclarationResult {
    public int[] solution(String[] id_list, String[] report, int k) {
        // 신고한 유저 리스트 : id_list 
        // 신고 기록 : report ([신고한 유저] [신고 당한 사람])  ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
        // 정지될 신고 개수 : k

        HashMap<String, ArrayList<String>> declareMap = new HashMap<String, ArrayList<String>>();
        HashMap<String, Integer> stopList = new HashMap<>();
        ArrayList<String> stopUser = new ArrayList<>();
        int[] result = new int[id_list.length];

        for (String repo : report) {
            String[] parseRepo = repo.split("\\s+");

            // 신고한 사람
            String reportUser = parseRepo[0];
            // 신고 당한 사람
            String targetUser = parseRepo[1];

            ArrayList<String> list = declareMap.getOrDefault(reportUser, new ArrayList<String>());
            if (!list.contains(targetUser)){
                list.add(targetUser);
            }

            // 신고한 사람의 신고 리스트를 불러와서 추가하고, '신고 리스트 자료형'에 넣는 로직
            declareMap.put(reportUser, list);  
            
            int count = stopList.getOrDefault(targetUser, 0) + 1;
            // 신고 당한 사람의 신고 수 넣는 로직
            stopList.put(targetUser, count);

            if (count >= 2 && stopUser.contains(targetUser)) {
                stopUser.add(targetUser);
            }
        }

        for (int i = 0; i < id_list.length; i++) {
            int count = 0;

            if (declareMap.get(id_list[i]) == null) continue;

            ArrayList<String> list = declareMap.get(id_list[i]);

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


    public int[] solution1(String[] id_list, String[] report, int k) {
        int[] result = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();
		
        for(int i = 0 ; i<id_list.length ; i++) {
			index.put(id_list[i], i);
		}
        
        for(String rep : report) {
        	String[] parseRepo = rep.split(" ");
        	String reportUser = parseRepo[0];
            String targetUser = parseRepo[1];

            if(!list.containsKey(targetUser)) {
                list.put(targetUser, new ArrayList<>());
            }
            
        	List<Integer> tmp = list.get(targetUser);
        	
        	if(!tmp.contains(index.get(reportUser))) {
                tmp.add(index.get(reportUser));
            }
        }
        
        for(int i=0 ; i<id_list.length ; i++) {
        	String id = id_list[i];
        	if(list.containsKey(id) && list.get(id).size() >= k) {
	        	for(int idx : list.get(id)) {
	        		result[idx]++;
	        	}
        	}
        }
        
        return result;
    }

    public static void main(String[] args) {
        GiveDeclarationResult giveDeclarationResult = new GiveDeclarationResult();

        String[] givenIdList = {"muzi", "frodo", "apeach", "neo"};
        String[] givenReport = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; // muzi, apeach, frodo 
        int k = 2;

        int[] result = giveDeclarationResult.solution1(givenIdList, givenReport, k);
        
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