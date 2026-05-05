package solid.srp.practice;

public interface UserRepository {

    void save (User user);

    boolean existsByLogin(String login);


}
