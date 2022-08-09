// package giphy.project.models;

// import jakarta.json.Json;
// import jakarta.json.JsonObject;

// public class Giphy {
//     private String id;
//     private String type;
//     private String url;

  
   
//     public String getId() {
//         return id;
//     }

//     public void setId(String id) {
//         this.id = id;
//     }

//     public String getType() {
//         return type;
//     }

//     public void setType(String type) {
//         this.type = type;
//     }

//     public String getUrl() {
//         return url;
//     }

//     public void setUrl(String url) {
//         this.url = url;
//     }



//     public static Giphy create(JsonObject jo) {
//         Giphy g = new Giphy();
//         g.setId(jo.getString("id"));
//         g.setType(jo.getString("type"));
//         g.setType(jo.getString("url"));
//         return g;
//     }

//     public JsonObject toJson() {
//         return Json.createObjectBuilder()
//             .add("id", id)
//             .add("type", type)
//             .add("url", url)
//             .build();
//     }
// }
