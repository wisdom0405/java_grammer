package C07ExceptionFileParsing.Practice;
//1.Author 엔티티
//-id, name, email, password
//-생성자에서 초기화, getter로만 구성
public class Author {
    static Long static_id = 0L; // 회원가입할때 자동적으로 추가되는 id (auto_increment)
    private Long id; // 그냥 id
    private String name;
    private String email;
    private String password;

    public static Long getStatic_id() {
        return static_id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    // Author 객체 생성자
    Author(String name, String email, String password){
        // Author 객체를 생성할 때 이름, 이메일, 패스워드 입력한다.
        static_id += 1; // 객체가 생성될 때마다 static id는 자동으로 1씩 증가하고
        this.id = static_id; // 그 static id가 Author의 고유한 id이다.
        this.name = name;
        this.email = email;
        this.password = password;
    }
}
