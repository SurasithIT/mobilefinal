package kmitl.ac.th.a59070181;


import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginFragment extends Fragment{
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void initLoginBtn(){
        Button loginBtn = getView().findViewById(R.id.login_btn);
        loginBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                EditText userId = getView().findViewById(R.id.login_userid);
                EditText password = getView().findViewById(R.id.login_password);
                String userIdStr = userId.getText().toString();
                String passwordStr = password.getText().toString();

                if (userIdStr.isEmpty() || passwordStr.isEmpty()) {
                    Toast.makeText(getActivity(), "Please fill out this form", Toast.LENGTH_SHORT).show();
                } else {
                    signIn(userIdStr, passwordStr);
                }
            }
        });
    }

    public void initRegisterBtn() {
        TextView _registerBtn = getView().findViewById(R.id.login_register);
        _registerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.main_view, new RegisterFragment())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }

    public void signIn(String userId, String password){

    }

}
