package local.hal.an91.android.saigoku33fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TempleListFragment extends Fragment {

    /**
     * このフラグメントが所属するアクティビティオブジェクト。
     */
    private Activity _parentActivity;

    /**
     * 大画面かどうかの判定フラグ。
     * trueが大画面。falseが通常画面。
     * 判定ロジックは同一画面に表示用フレームレイアウトが存在するかどうかで行う。
     */
    private boolean _isLayoutXLarge = true;

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        //親クラスのメソッドを呼び出し。
        super.onActivityCreated(savedInstanceState);
        //自分が所属するアクティビティからtempleDetailFrameを取得。
        View templeDetailFrame = _parentActivity.findViewById(R.id.templeDetailFrame);
        //templeDetailFrameがnull、
        if (templeDetailFrame == null){
            //画面判定フラグを通常画面とする。
            _isLayoutXLarge = false;
        }
    }


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public static TempleListFragment newInstance(String param1, String param2) {
        TempleListFragment fragment = new TempleListFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        //親クラスのonCreate（）の呼び出し。
        super.onCreate(savedInstanceState);
        //所属するアクティビティオブジェクトを取得。
        _parentActivity = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      //フラグメントで表示する画面をXMLファイルからインフレートする。
        View view = inflater.inflate(R.layout.fragment_temple_list,container,false);
        //画面部品ListViewを取得。
        ListView lvTemple = view.findViewById(R.id.lvTemple);
        //SimpleAdapterで使用するListオブジェクトを用意。
        List<Map<String,String>> templeList = new ArrayList<>();

        //1
        Map<String,String> temple = new HashMap<>();
        temple.put("name","青岸渡寺");
        temple.put("number","第一番");
        templeList.add(temple);

        //2
        temple = new HashMap<>();
        temple.put("name","金剛宝寺");
        temple.put("number","第二番");
        templeList.add(temple);

        //3
        temple = new HashMap<>();
        temple.put("name","粉河寺");
        temple.put("number","第三番");
        templeList.add(temple);

        //4
        temple = new HashMap<>();
        temple.put("name","施福寺");
        temple.put("number","第四番");
        templeList.add(temple);

        //5
        temple = new HashMap<>();
        temple.put("name","葛井寺");
        temple.put("number","第五番");
        templeList.add(temple);

        //6
        temple = new HashMap<>();
        temple.put("name","南法華寺");
        temple.put("number","第六番");
        templeList.add(temple);

        //7
        temple = new HashMap<>();
        temple.put("name","岡寺");
        temple.put("number","第七番");
        templeList.add(temple);

        //8
        temple = new HashMap<>();
        temple.put("name","長谷寺");
        temple.put("number","第八番");
        templeList.add(temple);

        //9
        temple = new HashMap<>();
        temple.put("name","南円堂");
        temple.put("number","第九番");
        templeList.add(temple);

        //10
        temple = new HashMap<>();
        temple.put("name","三室戸寺");
        temple.put("number","第十番");
        templeList.add(temple);

        //11
        temple = new HashMap<>();
        temple.put("name","上醍醐 准胝堂");
        temple.put("number","第十一番");
        templeList.add(temple);

        //12
        temple = new HashMap<>();
        temple.put("name","正法寺");
        temple.put("number","第十二番");
        templeList.add(temple);

        //13
        temple = new HashMap<>();
        temple.put("name","石山寺");
        temple.put("number","第十三番");
        templeList.add(temple);

        //14
        temple = new HashMap<>();
        temple.put("name","三井寺");
        temple.put("number","第十四番");
        templeList.add(temple);

        //15
        temple = new HashMap<>();
        temple.put("name","今熊野観音寺");
        temple.put("number","第十五番");
        templeList.add(temple);

        //16
        temple = new HashMap<>();
        temple.put("name","清水寺");
        temple.put("number","第十六番");
        templeList.add(temple);

        //17
        temple = new HashMap<>();
        temple.put("name","六波羅蜜寺");
        temple.put("number","第十七番");
        templeList.add(temple);

        //18
        temple = new HashMap<>();
        temple.put("name","六角堂 頂法寺");
        temple.put("number","第十八番");
        templeList.add(temple);

        //19
        temple = new HashMap<>();
        temple.put("name","革堂 行願寺");
        temple.put("number","第十九番");
        templeList.add(temple);

        //20
        temple = new HashMap<>();
        temple.put("name","善峯寺");
        temple.put("number","第二十番");
        templeList.add(temple);

        //21
        temple = new HashMap<>();
        temple.put("name","穴太寺");
        temple.put("number","第二十一番");
        templeList.add(temple);

        //22
        temple = new HashMap<>();
        temple.put("name","総持寺");
        temple.put("number","第二十二番");
        templeList.add(temple);

        //23
        temple = new HashMap<>();
        temple.put("name","勝尾寺");
        temple.put("number","第二十三番");
        templeList.add(temple);

        //24
        temple = new HashMap<>();
        temple.put("name","中山寺");
        temple.put("number","第二十四番");
        templeList.add(temple);

        //25
        temple = new HashMap<>();
        temple.put("name","播州清水寺");
        temple.put("number","第二十五番");
        templeList.add(temple);

        //26
        temple = new HashMap<>();
        temple.put("name","一乗寺");
        temple.put("number","第二十六番");
        templeList.add(temple);

        //27
        temple = new HashMap<>();
        temple.put("name","圓教寺");
        temple.put("number","第二十七番");
        templeList.add(temple);

        //28
        temple = new HashMap<>();
        temple.put("name","成相寺");
        temple.put("number","第二十八番");
        templeList.add(temple);

        //29
        temple = new HashMap<>();
        temple.put("name","松尾寺");
        temple.put("number","第二十九番");
        templeList.add(temple);

        //30
        temple = new HashMap<>();
        temple.put("name","宝厳寺");
        temple.put("number","第三十番");
        templeList.add(temple);

        //31
        temple = new HashMap<>();
        temple.put("name","長命寺");
        temple.put("number","第三十一番");
        templeList.add(temple);

        //32
        temple = new HashMap<>();
        temple.put("name","観音正寺");
        temple.put("number","第三十二番");
        templeList.add(temple);

        //33
        temple = new HashMap<>();
        temple.put("name","華厳寺");
        temple.put("number","第三十三番");
        templeList.add(temple);

        //SimpleAdapter第4引数from用データの用意。
        String[] from = {"number","name"};
        //SimpleAdapter第５引数To用データを用意。
        int[] to = {android.R.id.text1,android.R.id.text2};
        //SimpleAdapterを生成。
        SimpleAdapter adapter = new SimpleAdapter(_parentActivity,templeList,android.R.layout.simple_list_item_2,from,to);
        //アダプタの登録。
        lvTemple.setAdapter(adapter);
        //リスナの登録。
        lvTemple.setOnItemClickListener(new ListItemClickListener());
        //インフレートされた画面を戻り値として返す。
        return view;
    }
    /**
     * リストがタップされたときの処理が記述されたメンバクラス。
     */
    private class ListItemClickListener implements AdapterView.OnItemClickListener{

        @Override
        public void onItemClick(AdapterView<?> parent, View view,int position,long id){
            //タップされた行のデータを取得。
            Map<String,String> item = (Map<String, String>) parent.getItemAtPosition(position);

            //寺院名と札番号を取得。
            String templeName = item.get("name");
            String templeNumber = item.get("number");

            //引継ぎデータをまとめて格納できるBundleオブジェクトを生成。
            Bundle bundle = new Bundle();
            //Bundleオブジェクトに引継ぎデータを格納。
            bundle.putString("templeNumber",templeNumber);
            bundle.putString("templeName",templeName);

            //大画面の場合
            if (_isLayoutXLarge){
                //フラグメントマネージャーを取得。
                FragmentManager manager = getFragmentManager();
                //フラグメントトランザクションの開始。
                FragmentTransaction transaction = manager.beginTransaction();
                //完了フラグメントを生成。
                TempleDetailFragment templeDetailFragment = new TempleDetailFragment();
                //引継ぎデータを完了フラグメントに格納。
                templeDetailFragment.setArguments(bundle);
                //生成した完了フラグメントをtempleDetailFrameレイアウト部品に追加（置き換え）
                transaction.replace(R.id.templeDetailFrame,templeDetailFragment);
                //フラグメントトランザクションのコミット。
                transaction.commit();
            }
            //通常画面の場合。
            else {
                //インテントオブジェクトを生成。。
                Intent intent = new Intent(_parentActivity,TempleDetailActivity.class);
                //第2画面に送るデータを格納。
                intent.putExtras(bundle);
                //第2画面の起動。
                startActivity(intent);
            }
        }
    }
}