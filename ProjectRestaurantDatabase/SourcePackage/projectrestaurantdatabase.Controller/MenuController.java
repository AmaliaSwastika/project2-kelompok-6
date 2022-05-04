/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectrestaurantdatabase.Controller;

import java.sql.ResultSet;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import projectrestaurantdatabase.Helper.Helper;
import projectrestaurantdatabase.Model.MenuModel;
import projectrestaurantdatabase.Query.MenuQuery;

/**
 *
 * @author Asus
 */
public class MenuController extends BaseController {
    
    Helper helper = new Helper();
   MenuQuery query = new MenuQuery();
    
    public boolean create(MenuModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        
        map.put(1, model.getAyam_bakar());
        map.put(2, model.getIkan_goreng());
        map.put(3, model.getSushi());
        map.put(4, model.getTongseng());
        map.put(5, model.getEs_teh());
        map.put(6, model.getJus_alpukat());
        map.put(7, model.getThai_tea());
        map.put(8, model.getMatcha());
        map.put(9, model.getCash());
       
        
        
        String sql = this.query.create;
        
        return this.preparedStatement(map, sql);
    }
    public ResultSet get(){
        String sql = this.query.get;
        return this.get(sql);  
    }
    
    public ResultSet showById(String id){
      String sql = this.query.showById;
      
      Map<Integer, Object> map = new HashMap<>();
      map.put(1, id);
      
      return this.getWithParameter(map, sql);
    }
    
    public boolean update(String id, MenuModel model) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, model.getAyam_bakar());
        map.put(2, model.getIkan_goreng());
        map.put(3, model.getSushi());
        map.put(4, model.getTongseng());
        map.put(5, model.getEs_teh());
        map.put(6, model.getJus_alpukat());
        map.put(7, model.getThai_tea());
        map.put(8, model.getMatcha());
        map.put(9, model.getCash());
        map.put(10, id);
        
        String sql = this.query.update;
        
        return this.preparedStatement(map, sql);
    }
    
    public boolean delete(String id) throws ParseException {
        
        Map<Integer, Object> map = new HashMap<>();
        map.put(1, id);
        
        String sql = this.query.delete;
        
        return this.preparedStatement(map, sql);
    }
    
}
