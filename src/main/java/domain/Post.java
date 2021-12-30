package domain;

public class Post {
    private int id;
    private int ownerId;
    private String postTitle;
    private String authorOfPost;

    {
        int idOfAuthor;
    }

    private String dateOfPost;

    {
        int date;
    }

    private String settingsOfPost;

    {
        String itIsNotInteresting;
        String saveToBookmarks;
        String complain;
        String notifyAboutEntries;
    }

    private String text;
    private String image;
    private String link;
    private String likes;

    {
        int countLike;
        boolean userLike;
    }

    private String comments;

    {
        int CountComment;
    }

    {
        String showFirst;
        {
            String firstInteresting;
            String firstNews;
            String firstOlds;
        }
        String showComments;
        {
            String authorOfComment;
            {
                int idAuthorOfComment;
            }
            String complain;
            String textOfComment;
            String timeOfWriting;
            {
                int time;
            }
            String answer;
            String toShare;
            String likesOfComment;
            {
                int countLikeComment;
                boolean userLikeComment;
            }
            String ShowTheFollowing;
        }
        String userLink;
        String addComment;
        {
            String addMediaFile;
            {
                String addPhoto;
                String addVideoRecording;
                String addAudioRecording;
                String addFile;
            }
            String addPhoto;
            String smileFaces;
            String sendComment;
        }
    }

    private String reposts;

    {
        int countReposts;
        boolean user_reposted;
    }

    private String viewing;

    {
        int countView;
    }
}
