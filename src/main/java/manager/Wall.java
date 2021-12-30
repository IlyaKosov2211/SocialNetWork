package manager;

import domain.Post;

public class Wall {
    private PostManager postManager;

    public String shaping(){
        Post[] posts=postManager.getPostsForWall();
        return null;
    }
}
