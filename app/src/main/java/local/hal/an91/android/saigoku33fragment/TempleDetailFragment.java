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
import android.widget.Button;
import android.widget.TextView;

public class TempleDetailFragment extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    /**
     *このフラグメントが所属するアクティビティオブジェクト。
     */
    private Activity _parentActivity;

    /**
     *大画面かどうかの判定フラグ。
     * trueが大画面。falseが通常画面。
     * 判定ロジックは同一画面にリストフラグメントが存在するかどうかで行う。
     */
    private boolean _isLayoutXLarge = true;

    public static TempleDetailFragment newInstance(String param1, String param2) {
        TempleDetailFragment fragment = new TempleDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
       //親クラスのonCreateの呼び出し。
        super.onCreate(savedInstanceState);
        //所属するアクティビティオブジェクトを取得。
        _parentActivity = getActivity();

        //フラグメントマネージャーを取得。
        FragmentManager manager = getFragmentManager();
        //フラグメントマネージャーからリストフラグメントを取得。
       TempleListFragment templeListFragment = (TempleListFragment) manager.findFragmentById(R.id.fragmentTempleList);
        //リスナフラグメントがnull、
        if (templeListFragment == null){
            //画面判定フラグを通常画面とする。
            _isLayoutXLarge = false;
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       //フラグメントで表示する画面をｘｍｌファイルからインフレートする。
        View view = inflater.inflate(R.layout.fragment_temple_detail,container,false);

        //Bundleオブジェクトを宣言。
        Bundle extras;
        //大画面の場合。
        if (_isLayoutXLarge){
            //このフラグメントに埋め込まれた引継ぎデータを取得。
            extras = getArguments();
        }
        //通常画面の場合。
        else{
            //所属アクティビティからインテントを取得。
            Intent intent = _parentActivity.getIntent();
            //インテントから引継ぎデータをまとめたものを取得。
            extras = intent.getExtras();
        }

        //選択した寺院名と札番号変数を用意。
        String templeName = "";
        String templeNumber = "";

        if (extras != null){
            //寺院名と札番号を取得。
            templeName = extras.getString("templeName");
            templeNumber = extras.getString("templeNumber");
        }
        //寺院名と札番号寺院名と札番号を表示させるTextViewを取得。
        TextView tvTempleName = view.findViewById(R.id.tvTempleName);
        TextView tvTempleNumber = view.findViewById(R.id.tvTempleNumber);
        //TextViewに寺院名と札番号を表示。
        tvTempleNumber.setText(templeNumber);
        tvTempleName.setText(templeName);

        //戻るボタンを取得。
        Button btBackButton = view.findViewById(R.id.btBackButton);
        //戻るボタンにリスナを登録。
        btBackButton.setOnClickListener(new ButtonClickListener());

        //インフレートされた画面を戻り値として返す。
        return view;
    }

    /**
     * 戻るボタンが押されたときの処理
     */
    private class ButtonClickListener implements View.OnClickListener{

        @Override
        public void onClick(View view){
            //大画面の場合
            if (_isLayoutXLarge){
                FragmentManager manager = getFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.remove(TempleDetailFragment.this);
                transaction.commit();
            }
            else {
                _parentActivity.finish();
            }

        }
    }
}