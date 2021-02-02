package sample;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.util.*;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.fxml.FXML;
import javafx.scene.control.SplitMenuButton;
import javafx.scene.control.TextField;

class GiftShop{
    public ArrayList<String> gift(){
        // Here! hobby ArrayList stores the hobbies of the friend whom you wanna gift rather than the available hobbies(hobby list) in the shop
        ArrayList<String> gifts = new ArrayList<String>();
            //if(hobby.get(i).equals("painting") || hobby.get(i).equals("Painting")){
        gifts.add("Oil painting set");
        gifts.add("Acrylic painting set");
        gifts.add("Painting catelog");
        gifts.add("Paint brush set");
        gifts.add("Canvas Stand");
        //    }else if(hobby.get(i).equals("learning something new") || hobby.get(i).equals("learning something new") || hobby.get(i).equals("Learning")){
        gifts.add("Coursera subscription");
        gifts.add("Codecademy Pro subscription");
        gifts.add("Progate Plus subscription");
        gifts.add("Udemy 50 course subscription");
        gifts.add("Udacity 100% off discount coupon X 2");
        gifts.add("\' Learn Something New \' T-shirt");
        gifts.add("Pen set with memo pad");
        gifts.add("Stationary set");
        //    }else if(hobby.get(i).equals("Writing poems") || hobby.get(i).equals("poetry") || hobby.get(i).equals("Poetry") || hobby.get(i).equals("story writing")){
        gifts.add("Fancy writing pad");
        gifts.add("Poetry book club membership");
        gifts.add("Famous Poets Coffee mug");
        gifts.add("Literary Candle");
        gifts.add("Poetic Tshirt");
        gifts.add("Fancy poetic pen");
        gifts.add("Fancy poetry lover's kit");
        //    }else if(hobby.get(i).equals("Driving") || hobby.get(i).equals("driving")) {
        gifts.add("Speakers");
        gifts.add("Car perfume");
        gifts.add("Bead seat cover");
        //    }else if(hobby.get(i).equals("physical activities")||hobby.get(i).equals("Running")||hobby.get(i).equals("running") || hobby.get(i).equals("outdoor activities ") || hobby.get(i).equals("Physical Activities") || hobby.get(i).equals("Gyming")||hobby.get(i).equals("gyming") ){
        gifts.add("skipping rope");
        gifts.add("yoga mat");
        gifts.add("weights");
        gifts.add("Sports shoes");
        gifts.add("sportswear");
        gifts.add("fitness band/ calorie tracker/smart watch");
        gifts.add("water bottle");
        gifts.add("Exercising cycle/ Cycle");
        gifts.add("protein shake");
        gifts.add("Knee caps/ Elbow caps");
        //    }else if(hobby.get(i).equals("Reading") || hobby.get(i).equals("Reading books") || hobby.get(i).equals("Novels and books") || hobby.get(i).equals("reading")){
        gifts.add("Kindle");
        gifts.add("Books");
        gifts.add("Novels");
        gifts.add("Amazon giftcard");
        gifts.add("Library membership");
        //    }else if(hobby.get(i).equals("Hanging out with friends") || hobby.get(i).equals("Going out")) {
        gifts.add("Food coupons/Voucher");
        gifts.add("List of hang out spots");
        gifts.add("Accesories");
        //    }else if(hobby.get(i).equals("Writing") || hobby.get(i).equals("writing")) {
        gifts.add("Fancy writing pad");
        gifts.add("Type writer");
        gifts.add("Dictionary");
        gifts.add("Fancy pen");
        //    }else if(hobby.get(i).equals("Sports") || hobby.get(i).equals("sports")||hobby.get(i).equals("Running")||hobby.get(i).equals("running")) {

        gifts.add("Sport equipments");
        gifts.add("Decathlon/Amazon coupons");
        gifts.add("Smartwatch/Fitness band");
        gifts.add("Sportswear");
        //    }else if(hobby.get(i).equals("Social Work") || hobby.get(i).equals("social work")||hobby.get(i).equals("Volunteering")) {
        gifts.add("Cap");
        gifts.add("Self care kit");
        gifts.add("Card/ handwritten note of appreciation");
        //    }else if(hobby.get(i).equals("binge watching") || hobby.get(i).equals("Watching Television")||hobby.get(i).equals("Television")) {
        gifts.add("Netflix Subscription");
        gifts.add("Amazon Prime subscription");
        gifts.add("Tata Sky Coupons");
        gifts.add("Guide to the best shows in every genre");
        //    }else if(hobby.get(i).equals("Social networking") || hobby.get(i).equals("Instagram")||hobby.get(i).equals("Snapchat")||hobby.get(i).equals("Facebook")||hobby.get(i).equals("Twitter")) {
        gifts.add("Anti glare screen expander");
        gifts.add("Blue ray block glasses");
        gifts.add("Selfie stick");
        gifts.add("Tripod stand");
        gifts.add("List of latest trends");
        //    }else if(hobby.get(i).equals("Video games") || hobby.get(i).equals("games")) {
        gifts.add("fancy lights");
        gifts.add("gaming chair");
        gifts.add("anti glare glasses");
        gifts.add("headphones");
        //   }else if(hobby.get(i).equals("sleeping") || hobby.get(i).equals("Sleeping")) {
        gifts.add("Pillow");
        gifts.add("Blanket");
        gifts.add("Eye cover");
        //   }else if(hobby.get(i).equals("coding") || hobby.get(i).equals("programming")||hobby.get(i).equals("exploring domains of cs")) {
        gifts.add("Coursera subscription");
        gifts.add("Codecademy pro subscription");
        gifts.add("Laptop hardwares upgrades");
        gifts.add("Self-learning Books and CDs");
        gifts.add("Paid Projects");
        //    }else if(hobby.get(i).equals("Dancing") || hobby.get(i).equals("dancing")) {
        gifts.add("Speakers");
        gifts.add("Tutorial CDs");
        gifts.add("Dance shoes");
        gifts.add("Knee caps");
        gifts.add("Dance class subscription");
        gifts.add("Music app subscription");
        //    }else if(hobby.get(i).equals("Music") || hobby.get(i).equals("music")) {
        gifts.add("Speakers");
        gifts.add("Headphones");
        gifts.add("Music app subscription");
        //   }else if(hobby.get(i).equals("Eating") || hobby.get(i).equals("eating")) {
        gifts.add("Restaurant coupons");
        gifts.add("Zomato / Uber eats coupons");
        gifts.add("Guide to best food joints");
        //   }else if(hobby.get(i).equals("Eating") || hobby.get(i).equals("eating")) {
        gifts.add("Recipe books");
        gifts.add("Cookery classes Subscription");
        gifts.add("Crockery");
        //    }
        //}
        return gifts;
    }
}

public class Controller extends GiftShop implements Initializable {
    //@FXML private TextField newHobby;
    @FXML private ListView<String> selectedGiftList;
    @FXML private ListView<String> giftsRecommended;
    @FXML private TextField name;
    @FXML private SplitMenuButton age;
    @FXML private SplitMenuButton sex;

    //@FXML private String sex;
    //@FXML private String age;

    private String filePath = "data.txt";
    private String giftInfoPath = "gifts.txt";
    private File data = new File(filePath);

    public void addGift(ActionEvent e){
        //String text = newHobby.getText();
        //System.out.println(text);
        //if(!text.equals("")) {
        String selected = giftsRecommended.getSelectionModel().getSelectedItem();
        if(selected != null){
            selectedGiftList.getItems().add(selected);
            System.out.println(selected+" is added");
        }else{
            System.out.println("No gifts have been selected by the user!");
        }
    }

    // changes are below!!
    public String getName(){ return name.getText(); }

    public String getAge(){
        return age.getText();
    }

    public String getSex(){
        return sex.getText();
    }


    public void displayGifts(ActionEvent e){
        for(String i : gift()) {
            giftsRecommended.getItems().add(i);
        }
    }


    public void deleteGift(ActionEvent e){
        String selected = selectedGiftList.getSelectionModel().getSelectedItem();
        if(selected != null){
            selectedGiftList.getItems().remove(selected);
        }else{
            System.out.println("No Gift is Selected by the user!");
        }
    }


    public void exitProgram(ActionEvent e) {
        System.out.println(getName() +" who is " + getAge() + " years old bought the above items.");
        System.out.println("Exiting the program.....");
        ObservableList<String> currentGiftsBoughtList = selectedGiftList.getItems();
        ObservableList<String> currentGiftList = giftsRecommended.getItems();
        try {
            FileWriter writer2 = new FileWriter(giftInfoPath);
            FileWriter writer = new FileWriter(filePath);
            for (String text: currentGiftsBoughtList) {
                text += "\n";
                writer.write(text);
            }
            writer.write(getName());
            writer.write(getAge());
            writer.write(getSex());
            for(String text: currentGiftList){
                text+= "\n";
                writer2.write(text);
            }
            writer.close();
            writer2.close();
        } catch (IOException io) {
            io.printStackTrace();
        }

        System.exit(0);
    }

    /*
    public void exitProgram(ActionEvent e){
        try{
            List<String> currentHobbies = hobbyList.getItems();
            FileWriter writer = new FileWriter("data.txt");
            for(String text : currentHobbies){
                text+=" \n";
                writer.write(text);
            }
            writer.close();
        }catch(FileNotFoundException e){};
        catch(IOException e){};
        finally{
            System.exit(0);
        }
    }
    */

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
            Scanner myReader = new Scanner(data);

            while (myReader.hasNextLine()) {
                String text = myReader.nextLine();
                selectedGiftList.getItems().add(text);
            }

            myReader.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }



}
