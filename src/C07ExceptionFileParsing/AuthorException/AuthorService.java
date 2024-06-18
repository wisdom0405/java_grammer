package C07ExceptionFileParsing.AuthorException;

public class AuthorService {
    AuthorRepository authorRepository;

    AuthorService(){
        // 생성자 호출
        authorRepository = new AuthorRepository();
    }

    void register(String name, String email,String password){
        // 생성한 Author 객체(author) AuthorRepository의 register 메소드에 넘겨줌
        if(password.length()<6 || authorRepository.isExist(email)){
            // 비밀번호 길이 5자 이하이면 IllegalArgument 예외 던져줌
            throw new IllegalArgumentException("중복된 이메일이거나 비밀번호가 5자리 이하입니다.");
        }else{
            // AuthorController에서 name, email, password 받아 Author 객체 생성
            Author author = new Author(name, email, password);
            authorRepository.register(author);
            System.out.println(name+"님의 회원가입이 완료되었습니다.");
            System.out.println("회원님의 id는 " + author.getId() + " 입니다.");
        }
    }
    void login(String email, String password){
        if(authorRepository.isExist(email)){

        }
    }


}
