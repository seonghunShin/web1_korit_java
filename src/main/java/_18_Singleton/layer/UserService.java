package _18_Singleton.layer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;

// 비즈니스로직 처리하는 객체
public class UserService {
    private static UserService instance;
    private UserRepo userRepository;

    private UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public static UserService getInstance(UserRepo userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    // 회원가입
    // 실제 스프링에서는 객체로 묶어서 받음.
    public void signup(String id, String password) throws Exception {
        User[] users = userRepository.findAll();

        // 중복 아이디 검사
        // for문 돌면서 username 동일한가 체크
        for (User user : users) {
            if (user == null) {
                continue; // 빈 칸은 건너뛰기
            }

            if (user.getUsername().equals(id)) {
                System.out.println("이미 존재하는 아이디입니다.");
                return;
            }
        }

        // users 빈 칸에 신규 유저를 삽입.
        // for문 돌면서 null찾으면 user 객체 만들어 넣기
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                continue;
            }

            users[i] = new User(id, password);
            userRepository.saveAll(users);
            System.out.println("회원가입 성공!");
            return;
        }
        System.out.println("회원이 가득 찼습니다.");
    }

    // 전체 회원 조회
    public void showAllUsers() throws Exception {
        User[] users = userRepository.findAll();

        int count = 0;
        System.out.println("== 회원 명단 ==");
        for (User user : users) {
            if (user == null) {
                continue;
            }
            count++;

            String username = user.getUsername();
            System.out.println(count + "." + username);
        }
    }

    public String singin(String username, String password) throws Exception {
        // 유저들 받아와서
        // for 순회하면서 아이디, 패스워드 모두 동일한지? 탐색
        // 성공시 -> 로그인 성공! 리턴
        // 실패시 -> 아이디 혹은 비밀번호가 틀렸습니다. 리턴

        User[] users = userRepository.findAll();
        for (User user : users) {
            boolean isValidUser;
            if (user.getUsername().equals(password) && user.getUsername().equals(username)) {
                return "로그인 성공!";
            }
        }
        return "아이디 혹은 비밀번호가 틀렸습니다.";
    }

}
