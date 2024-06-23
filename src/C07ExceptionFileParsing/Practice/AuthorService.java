package C07ExceptionFileParsing.Practice;

public class AuthorService {
    AuthorService(){
        // AuthorService 생성자호출
        AuthorRepository authorRepository = new AuthorRepository();
    }

    // AuthorService의 register 메소드
    // AuthorController에서 name, email, password 받아서 Author 객체 생성하는 메섣
    // Author 객체 생성 후 AuthorRepository에서 Author를 저장하는 메소드 호출
    public void register(String name, String email, String password){
        Author author = new Author(name, email, password);
        authorRepository.register(author);
    }
}
