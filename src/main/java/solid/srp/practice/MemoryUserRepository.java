package solid.srp.practice;

import java.util.HashMap;
import java.util.Map;



    public class MemoryUserRepository implements UserRepository {

        private final Map<String, User> users = new HashMap<>();

        @Override
        public void save(User user) {

            if (user == null)
                throw new IllegalArgumentException("User must not be null");

            if ( existsByLogin(user.getLogin()) ) {
                throw new IllegalArgumentException("User with login " + user.getLogin() + " already exists");
            }

            users.put(user.getLogin(), user);

        }

        @Override
        public boolean existsByLogin(String login) {
            return users.containsKey(login);
        }
    }


