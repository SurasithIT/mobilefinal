package kmitl.ac.th.a59070181;

import android.app.Fragment;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterFragment extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_register, container, false);

    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    void initRegisterBtn(){
        Button registerBtn = getView().findViewById(R.id.regist_btn);
        registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText userID = getView().findViewById(R.id.regist_userid);
                EditText password = getView().findViewById(R.id.regist_password);
                EditText name = getView().findViewById(R.id.regist_name);
                EditText age = getView().findViewById(R.id.regist_age);

                String userIdStr = userID.getText().toString();
                String passwordStr = password.getText().toString();
                String nameStr = name.getText().toString();
                String ageStr = age.getText().toString();
                int ageInt = Integer.parseInt(ageStr);


                if (userIdStr.length() < 6 && userIdStr.length() > 12){
                    Toast.makeText(getActivity(), "User ID Length is 6-12 character", Toast.LENGTH_SHORT).show();
                } else if (passwordStr.length() < 6) {
                    Toast.makeText(getActivity(), "Password must be greater than 5 character", Toast.LENGTH_SHORT).show();
                } else if (ageInt < 10 && ageInt > 80) {
                    Toast.makeText(getActivity(), "Age is must be 10-80 years", Toast.LENGTH_SHORT).show();
                }else {
                        createAccount(userIdStr,passwordStr);
                    }
                }

            });
        }

        public void createAccount(String user,String password){
            //SQLiteDatabase db = getWritableDatabase();

    }
}
