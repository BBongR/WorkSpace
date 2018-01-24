package com.example.administrator.tabpagerfragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;


public class FragmentTab2 extends Fragment {
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private View inflatedView;
    private ArrayAdapter mAdapter;
    private ListView mListView;
    private ArrayList<String> mData;

    private String mParam1;
    private String mParam2;

    private EditText editText;
    private Button btn_add;
    private Button btn_mod;
    private Button btn_del;

    public FragmentTab2() {
    }

    public static FragmentTab2 newInstance(String param1, String param2) {
        FragmentTab2 fragment = new FragmentTab2();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        inflatedView = inflater.inflate(R.layout.fragment_tab2, container, false);

//        TextView tv = v.findViewById(R.id.textView1);
//        tv.setText(mParam1);
        return inflatedView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        // 데이터
        String[] item = getResources().getStringArray(R.array.items);
        mData = new ArrayList<String>(Arrays.asList(item));

        mAdapter = new ArrayAdapter(getContext(), android.R.layout.simple_list_item_multiple_choice, mData);
        mListView = inflatedView.findViewById(R.id.list_view_tab2);
        mListView.setAdapter(mAdapter);
        mListView.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);

        editText = inflatedView.findViewById(R.id.editText);
        btn_add = inflatedView.findViewById(R.id.btn_add);
        btn_mod = inflatedView.findViewById(R.id.btn_mod);
        btn_del = inflatedView.findViewById(R.id.btn_del);

        BtnListener btnListener = new BtnListener();
        btn_add.setOnClickListener(btnListener);
        btn_mod.setOnClickListener(btnListener);
        btn_del.setOnClickListener(btnListener);
    }

    private class BtnListener implements View.OnClickListener {
        SparseBooleanArray check;

        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btn_add:
                    if (editText.getText().toString().equals("")) {
                        break;
                    }
                    String input = editText.getText().toString();
                    mData.add(input);
                    mAdapter.notifyDataSetChanged();
                    mListView.clearChoices();
                    mListView.smoothScrollByOffset(mAdapter.getCount() - 1);
                    editText.setText("");
                    break;

                case R.id.btn_mod:
                    check = mListView.getCheckedItemPositions();
                    if (!editText.getText().toString().equals("")) {
                        for (int i = 0; i < mData.size(); i++) {
                            if (check.get(i) == true) {
                                mData.set(i, editText.getText().toString());
                            }
                        }
                    }

                    mAdapter.notifyDataSetChanged();
                    mListView.clearChoices();
                    editText.setText("");
                    break;

                case R.id.btn_del:
                    check = mListView.getCheckedItemPositions();

                        for (int i = mData.size() - 1; i >= 0; i--) {
                            if (check.get(i) == true) {
                                mData.remove(i);
                            }
                        }


                    mAdapter.notifyDataSetChanged();
                    mListView.clearChoices();
                    break;
            }
        }
    }
}
