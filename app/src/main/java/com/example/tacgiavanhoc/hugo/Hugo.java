package com.example.tacgiavanhoc.hugo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.tacgiavanhoc.MainActivity;
import com.example.tacgiavanhoc.R;
import com.example.tacgiavanhoc.TacGiaApdapter;

import java.util.ArrayList;
import java.util.List;

public class Hugo extends AppCompatActivity {
    List<TacPham> items = new ArrayList<>();
    TacPhamAdapterHugo adapter;

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hugo);
        listView = (ListView) findViewById(R.id.listTacPham);
        items.add(new TacPham("Những người khốn khổ","Những người khốn khổ là câu chuyện về xã hội" +
                " nước Pháp trong khoảng hơn 20 năm đầu thế kỷ 19 kể từ thời điểm Napoléon " +
                "I lên ngôi và vài thập niên sau đó. Nhân vật chính của tiểu thuyết là Jean " +
                "Valjean, một cựu tù khổ sai tìm cách chuộc lại những lỗi lầm đã gây ra thời trai trẻ." +
                " Bộ tiểu thuyết không chỉ nói tới bản chất của cái tốt, cái xấu, của luật pháp, mà tác " +
                "phẩm còn là cuốn bách khoa thư đồ sộ về lịch sử, kiến trúc của Paris, nền chính trị," +
                " triết lý, luật pháp, công lý, tín ngưỡng của nước Pháp nửa đầu thế kỷ 19.",4,R.drawable.nntk)) ;
        items.add(new TacPham("chiêm ngưỡng","Tập thơ được xuất bản năm 1856 gồm 6 quyển," +
                " 156 bài thơ được viết chủ yếu từ năm 1841 tới 1855.",5,R.drawable.chiemnguong)) ;
        items.add(new TacPham("Ngày cuối cùng của một tử tù","Ngày Cuối Cùng Của Một Tử Tù” là cuốn sách khá thành công đến từ ngòi bút của nhà văn Victo Hugo. Ông là người có sức ảnh hưởng to lớn đối " +
                "với nền văn học Pháp nói riêng và văn học thế giới nói chung.",5,R.drawable.nccctutu)) ;
        items.add(new TacPham("Người cười","Victor Hugo viết xong Người cười năm 1868 dưới thời Napoleon III, khi nhà văn đang sống cuộc sống bị lưu đầy tại hòn đảo Guernsey thuộc lãnh thổ Anh trên biển Manche. Ông rời hòn đảo trở về lại nước Pháp hai năm sau đó, khi đế chế của Napoleon sụp đổ. Được khởi thảo và hoàn thành trong vòng hai năm (1866-1868), Thằng cười đã vượt qua dự định ban đầu của người viết: cuốn sách không" +
                " chỉ dừng lại ở một tác phẩm chính trị mà còn là " +
                "một tác phẩm triết học, lịch sử và thi ca..",5,R.drawable.nguoicuoi)) ;

        adapter = new TacPhamAdapterHugo(Hugo.this,items);
        listView.setAdapter(adapter);
    }
}