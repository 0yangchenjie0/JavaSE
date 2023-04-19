package oop.encapsulation.movies;

public class MoviesTest {
    public static void main(String[] args) {

        Movies movie1=new Movies(1,"肖申克的救赎",1994,9.7,"American","剧情 犯罪",
                "Frank Darabont","Tim Robbins  Morgan Feeeman");
        Movies movie2=new Movies(2,"霸王别姬",1993,9.6,"Hong Kong","剧情 爱情 同性",
                "陈凯歌","张国荣 张丰毅 巩俐 葛优");
        Movies movie3=new Movies(3,"阿甘正传",1994,9.5,"American","剧情 爱情",
                "Robert Zemeckis","Tom Hanks  Robin Wright");

        //将对象打包成数组
        Movies[] movies={movie1,movie2,movie3};

        //将一个类传递给另一个类
        MoviesService moviesService =new MoviesService(movies);//将对象数组作为形参传递给Service
        moviesService.start();



    }
}
