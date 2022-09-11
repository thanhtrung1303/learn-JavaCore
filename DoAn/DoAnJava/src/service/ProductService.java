package service;

import model.Character;
import model.Color;
import model.Condition;
import model.Product;
import model.Storage;

import java.util.ArrayList;

public class ProductService {
    public ArrayList<Product> getAllProduct(){
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(1,Character.NitendoSwitch,Condition.NEW,"Nitendo Switch Mario Red & Blue Edition","Nitendo Switch", Storage.AVAILABLE,9200000,7900000,"KH123457",Color.RED,10));
        products.add(new Product(2,Character.NitendoSwitch,Condition.NEW,"Nitendo Switch Monster Rise Special Edition","Nitendo Switch V2", Storage.AVAILABLE,10500000,10500000,"KH123458",Color.BLACK,1));
        products.add(new Product(3,Character.NitendoSwitch,Condition.OLD,"Máy Nitendo Switch Lite Yellow cũ Fullbox","Nitendo Switch Lite", Storage.AVAILABLE,4500000,4500000,"KH123458",Color.YELLOW,2));
        products.add(new Product(4,Character.NitendoSwitch,Condition.OLD,"Máy Nitendo Switch Lite Turquoise cũ Fullbox","Nitendo Switch Lite", Storage.AVAILABLE,4300000,4300000,"KH123458",Color.BLUE,2));
        products.add(new Product(5,Character.NitendoSwitch,Condition.OLD,"Combo Máy Nitendo Switch limited Spalatoon Edition cũ HACK","Nitendo Switch V2", Storage.SOLDOUT,9850000,9850000,"KH123458",Color.BLACK,3));
        products.add(new Product(6,Character.Game,Condition.NEW,"Monster Hunter Stories 2: Wings of Ruin","Monster Hunter",Storage.AVAILABLE,1350000,1350000,"KH123654",Color.CUSTOM,10));
        products.add(new Product(7,Character.Game,Condition.OLD,"Zelda:Breath of the Wild:Starter Pack","Zelda",Storage.SOLDOUT,1600000,1600000,"KH123654",Color.CUSTOM,0));
        products.add(new Product(8,Character.Game,Condition.NEW,"Oddworld: Munch's Oddysee","Munch's Oddysee",Storage.AVAILABLE,700000,700000,"KH123654",Color.CUSTOM,10));
        products.add(new Product(9,Character.Game,Condition.NEW,"Mortal Kombat 11","Pokemon",Storage.AVAILABLE,800000,800000,"KH123654",Color.CUSTOM,10));
        products.add(new Product(10,Character.Game,Condition.OLD,"Pokemon Sword","Pokemon",Storage.AVAILABLE,850000,850000,"KH123654",Color.CUSTOM,1));
        products.add(new Product(11,Character.Figure,Condition.NEW,"Đồng hồ báo thức Nitendo Gameboy","Watch",Storage.AVAILABLE,700000,700000,"KH123654",Color.CUSTOM,15));
        products.add(new Product(12,Character.Figure,Condition.NEW,"Đồng hồ báo thức đèn ngủ mô hình Eevee chính hãng TEKNOFUN","Eevee",Storage.AVAILABLE,1200000,1200000,"KH123654",Color.CUSTOM,8));
        products.add(new Product(13,Character.Figure,Condition.NEW,"Figure Super Mario Goomba đèn ngủ","Super Mario Goomba",Storage.AVAILABLE,730000,730000,"KH123654",Color.CUSTOM,10));
        products.add(new Product(14,Character.Figure,Condition.NEW,"Đồng hồ báo thức + FM Radio + đèn ngủ pokemon Pikachu","PokeBall",Storage.AVAILABLE,1200000,1200000,"KH123654",Color.CUSTOM,12));
        products.add(new Product(15,Character.Figure,Condition.NEW,"Mô hình Figure Pokemon mặt hài vui nhộn","Pokemon Troll Face",Storage.AVAILABLE,250000,250000,"KH123654",Color.CUSTOM,18));
        products.add(new Product(16,Character.Backpack,Condition.NEW,"Balo đeo Pikachu","Pikachu Backpack",Storage.AVAILABLE,280000,280000,"KH123654",Color.CUSTOM,4));
        products.add(new Product(17,Character.Backpack,Condition.NEW,"Túi đeo chéo Pokemon Monster","Pikachu Backpack",Storage.SOLDOUT,400000,400000,"KH123654",Color.CUSTOM,0));
        products.add(new Product(18,Character.Backpack,Condition.NEW,"Balo du lịch Deadpool","Deadpool Backpack",Storage.SOLDOUT,700000,700000,"KH123654",Color.CUSTOM,0));
        products.add(new Product(19,Character.Backpack,Condition.NEW,"Balo đeo Pokemon","Pikachu Backpack",Storage.AVAILABLE,400000,400000,"KH123654",Color.CUSTOM,2));
        products.add(new Product(20,Character.Backpack,Condition.NEW,"Bóp đựng viết Pokemon","Bóp đựng viết Pokemon",Storage.SOLDOUT,130000,130000,"KH123654",Color.CUSTOM,0));
        return products;
    }

    public void show(ArrayList<Product> products){
        for (Product p: products){
            System.out.println(p);
        }
    }
}
